/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		funPerson: {
			personId: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../fun/person/save?_' + $.now(),
		    	param: vm.funPerson,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
