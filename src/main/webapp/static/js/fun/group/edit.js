/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		funGroup: {
			groupId: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../fun/group/info?_' + $.now(),
		    	param: vm.funGroup.groupId,
		    	success: function(data) {
		    		vm.funGroup = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../fun/group/update?_' + $.now(),
		    	param: vm.funGroup,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})