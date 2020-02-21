$(document).ready(function(){
//	$('body').children().click(function(){
//		console.log($(this))
//	})
	$('#content img').click(function(){
		$('div.modal').addClass('is-active');
	});
	$('.delete, .modal-background').click(function(){
		$('div.modal').removeClass('is-active')
	});

});
