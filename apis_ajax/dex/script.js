function drawPoke(){
	for (i=1;i<=151;i++){
		$('#sprites').append("<img id='"+i+"'src='https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+i+".png'>");
	}
}
$(document).ready(function(){
	$('img').click(function(){
		$.getJSON("https://pokeapi.co/api/v2/pokemon/"+$(this).attr("id"),function(data){
			$("#name").text(data.name);
			$("#info").append("");
		})
	});
});
