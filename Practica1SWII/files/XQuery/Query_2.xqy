for $x in doc("prueba.xml")/Recetario/receta
return if ($x/@dificultad="Facil")
then <Prueba con este>{data($x/nombre)}</Prueba con este>
else <aun no>{data($x/nombre)}</aun no>