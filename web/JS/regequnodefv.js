function interes(){
    var equipo=document.formulario.nuevoequipo.value;
    var kilo=document.formulario.kilowatthora.value;
    var horas=document.formulario.horasdeuso.value;
    var min=document.formulario.minutosdeuso.value;
    var cantidade=document.formulario.cantidaddequipos.value;
    var t = document.getElementById("selectprioridad");
    var selecprioridad = t.options[t.selectedIndex].text;
    if (equipo==""){
        alert("Porfavor, ingresa un nombre de equipo ")
        return false
    }
    if (kilo==""){
        alert("Porfavor, ingresa la cantidad de kilowatts ")
        return false
    }
    if (horas==""){
        alert("Porfavor, ingresa las horas de uso")
        return false
    }
    if (min==""){
        alert("Porfavor, ingresa el numero de minutos")
        return false
    }
    if (horas=="horas"){
        alert("Porfavor, ingresa las horas de uso")
        return false
    }
    if (min=="minutos"){
        alert("Porfavor, ingresa el numero de minutos")
        return false
    }
    if (selecprioridad==""){
        alert("Porfavor, selecciona la prioridad del equipo")
        return false
    }
    if (cantidade==""){
        alert("Porfavor, ingresa la cantidad de equipos")
        return false
    }

    if(kilo<=0 || kilo>=999999){
        alert("El numero de consumo de kilowatt debe ser mayor a 0 y menor a 999999")
        return false
    }
    if(cantidade<=0 || cantidade>30){
         alert("La cantidad de equipos minimo que debe registrar es 1 y el maximo es 30")
        return false
    }
    if(horas<0 || horas>24){
        alert("Solamente puede ingresar de 0 a 24 horas")
        return false
    }
    if(min <0 || min>60){
        alert("Solamente puede ingresar de 0 a 60 minutos")
        return false
    }
    horasp=parseInt(horas);
    if(horasp==24){
    document.formulario.minutosdeuso.value=0
    var min=document.formulario.minutosdeuso.value;
    }
    var table = document.getElementById("tablita");
        var row = table.insertRow(-1);
        var celper = row.insertCell(0);
        var celsal = row.insertCell(1);
        var celdeu = row.insertCell(2);
        var cellcap = row.insertCell(3);
        var cellintp = row.insertCell(4);
        var cellpri = row.insertCell(5);
        //var table=document.getElementById("data_table");
   
        celper.innerHTML = equipo;
        celsal.innerHTML = kilo;
        celdeu.innerHTML= horas;
        cellcap.innerHTML= min;
        cellintp.innerHTML= cantidade;
        cellpri.innerHTML= selecprioridad;
}
function delete_row(no)
{
 document.getElementById("row"+no+"").outerHTML="";
}
function prueba(){
    var equipo=document.formulario.nuevoequipo.value;
    var kilo=document.formulario.kilowatthora.value;
    var horas=document.formulario.horasdeuso.value;
    var min=document.formulario.minutosdeuso.value;
    var cantidade=document.formulario.cantidaddequipos.value;
    var t = document.getElementById("selectprioridad");
    var selecprioridad = t.options[t.selectedIndex].text;
    if (equipo==""){
        alert("Porfavor, ingresa un nombre de equipo ")
        return false
    }
    if (kilo==""){
        alert("Porfavor, ingresa la cantidad de kilowatts ")
        return false
    }
    if (horas==""){
        alert("Porfavor, ingresa las horas de uso")
        return false
    }
    if (min==""){
        alert("Porfavor, ingresa el numero de minutos")
        return false
    }
    if (horas=="horas"){
        alert("Porfavor, ingresa las horas de uso")
        return false
    }
    if (min=="minutos"){
        alert("Porfavor, ingresa el numero de minutos")
        return false
    }
    if (selecprioridad==""){
        alert("Porfavor, selecciona la prioridad del equipo")
        return false
    }
    if (cantidade==""){
        alert("Porfavor, ingresa la cantidad de equipos")
        return false
    }

    if(kilo<=0 || kilo>=999999){
        alert("El numero de consumo de kilowatt debe ser mayor a 0 y menor a 999999")
        return false
    }
    if(cantidade<=0 || cantidade>30){
         alert("La cantidad de equipos minimo que debe registrar es 1 y el maximo es 30")
        return false
    }
    if(horas<0 || horas>24){
        alert("Solamente puede ingresar de 0 a 24 horas")
        return false
    }
    if(min <0 || min>60){
        alert("Solamente puede ingresar de 0 a 60 minutos")
        return false
    }
    horasp=parseInt(horas);
    if(horasp==24){
    document.formulario.minutosdeuso.value=0
    var min=document.formulario.minutosdeuso.value;
    }
    var table=document.getElementById("tablita");
    var table_len=(table.rows.length);
    var row = table.insertRow(table_len).outerHTML="<tr id='row"+table_len+"'><td id='equi_row"+table_len+"'>"+equipo+"</td><td id='kilo_row"+table_len+"'>"+kilo+"</td><td id='horas_row"+table_len+"'>"+horas+"<td id='min_row"+table_len+"'>"+min+"</td><td id='can_row"+table_len+"'>"+cantidade+"<td id='prio_row"+table_len+"'>"+selecprioridad+"<td><input type='button' value='Eliminar' class='delete' onclick='delete_row("+table_len+")'></td></tr>";
}

function guardar(){
    alert("Cambios guardados exitosamente")
}

function validarn(e){
    var teclado=(document.all)?e.KeyCode:e.which;
    var patron=/[a-zA-ZÁ-Úá-ú]/;
    var tec=String.fromCharCode(teclado);
    return patron.test(tec);
}
function validars(e){
    var teclado=(document.all)?e.KeyCode:e.which;
    var tec=String.fromCharCode(teclado);
    var patron=/[0-9-\d]/;
    return patron.test(tec);
}


