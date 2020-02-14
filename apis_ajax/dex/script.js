function drawPoke(){
	for (i=1;i<=151;i++){
		$('#sprites').append("<img id='"+i+"'src='https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+i+".png'>");
	}
}
$(document).ready(function(){
	$('img').click(function(){
		t=$(this)
		$.getJSON("https://pokeapi.co/api/v2/pokemon/"+$(this).attr("id"),function(data){
			$("ul").html("")
			$("b").css("display","block")
			$("#name").text(data.name);
//			$("#info").append("<img src='"+data.sprites.front_default+"'>");
			$("#info img").attr("src",data.sprites.front_default);
			for (i=0;data.types.length;i++){
				$("ul#types").append("<li>"+data.types[i].type.name+"</li>")
			}
			$("b#height").after("<p>"+data.height+"</p>");
///			$("#info").append("<audio src='img/"+data.name+"'>");
			Audio('img/'+data.name+'.m4a').play();
		})
	});
});
