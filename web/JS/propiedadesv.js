function interes(){
    var nombre=document.formulario.nombredepropiedad.value;
    var propiedad=formulario.propiedadza.selectedIndex;
    var delegacion=formulario.delegacionza.selectedIndex;
    var tarifa=formulario.ttarifa.selectedIndex;
    if (nombre==""){
        alert("Por favor, ingresa el nombre de la propiedad")
        return false
    }
    if (propiedad==""){
        alert("Por favor, ingresa el tipo  de propiedad")
        return false
    }
    if(delegacion==""){
        alert("Por favor, ingresa la delegacion donde se ubica la propiedad")
        return false
    }
    if (tarifa==""){ 
        alert ("Por favor selecciona el tipo de tarifa") 
        return false 
        }
        
       location.href="userwin.jsp"
    
}

