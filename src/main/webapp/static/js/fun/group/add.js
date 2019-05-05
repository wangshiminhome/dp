/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		funGroup: {
			groupId: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../fun/group/save?_' + $.now(),
		    	param: vm.funGroup,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
