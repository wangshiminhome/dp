/**
 * js
 */

$(function () {
	initialPage();
	getGrid();
});

function initialPage() {
	$(window).resize(function() {
		$('#dataGrid').bootstrapTable('resetView', {height: $(window).height()-56});
	});
}

function getGrid() {
	$('#dataGrid').bootstrapTableEx({
		url: '../../fun/group/list?_' + $.now(),
		height: $(window).height()-56,
		queryParams: function(params){
			params.name = vm.keyword;
			return params;
		},
		columns: [
			{checkbox: true},
            {field : "groupName", title : "分组名称", width : "200px"},
            {field : "groupState", title : "状态", width : "50px",
                formatter: function(value, row, index){
                    if(value == 0){
                        return '<i class="fa fa-toggle-off"></i>';
                    }
                    if(value == 1){
                        return '<i class="fa fa-toggle-on"></i>';
                    }
                }
            },
            {field : "addTime", title : "创建时间", width : "200px"},
            {field : "userId", title : "拥有人id", width : "100px",hidden:true},
            {field : "username", title : "拥有人", width : "100px",hidden:false},
            {title : "操作", formatter : function(value, row, index) {
                    var _html = '';
                    if (hasPermission('fun:group:edit')) {
                        _html += '<a href="javascript:;" onclick="vm.edit(\''+row.groupId+'\')" title="编辑"><i class="fa fa-pencil"></i></a>';
                    }
                    if (hasPermission('fun:group:remove')) {
                        _html += '<a href="javascript:;" onclick="vm.remove(false,\''+row.groupId+'\')" title="删除"><i class="fa fa-trash-o"></i></a>';
                    }
                    return _html;
                }
            }
		]
	})
}

var vm = new Vue({
	el:'#dpLTE',
	data: {
		keyword: null
	},
	methods : {
		load: function() {
			$('#dataGrid').bootstrapTable('refresh');
		},
		save: function() {
			dialogOpen({
				title: '新增',
				url: 'fun/group/add.html?_' + $.now(),
				width: '420px',
				height: '350px',
				yes : function(iframeId) {
					top.frames[iframeId].vm.acceptClick();
				},
			});
		},
		edit: function(groupId) {
            dialogOpen({
                title: '编辑',
                url: 'fun/group/edit.html?_' + $.now(),
                width: '420px',
                height: '350px',
                success: function(iframeId){
                    top.frames[iframeId].vm.funGroup.groupId = groupId;
                    top.frames[iframeId].vm.setForm();
                },
                yes: function(iframeId){
                    top.frames[iframeId].vm.acceptClick();
                }
            });
        },
        remove: function(batch, groupId) {
            var ids = [];
            if (batch) {
                var ck = $('#dataGrid').bootstrapTable('getSelections');
                if (!checkedArray(ck)) {
                    return false;
                }
                $.each(ck, function(idx, item){
                    ids[idx] = item.groupId;
                });
            } else {
                ids.push(groupId);
            }
            $.RemoveForm({
                url: '../../fun/group/remove?_' + $.now(),
                param: ids,
                success: function(data) {
                    vm.load();
                }
            });
        }
	}
})