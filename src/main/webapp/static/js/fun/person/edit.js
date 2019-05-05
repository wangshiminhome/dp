/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		funPerson: {
			personId: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../fun/person/info?_' + $.now(),
		    	param: vm.funPerson.personId,
		    	success: function(data) {
		    		vm.funPerson = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../fun/person/update?_' + $.now(),
		    	param: vm.funPerson,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})