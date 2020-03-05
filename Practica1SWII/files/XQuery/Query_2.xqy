for $x in doc("./files/xml/recetario1.xml")/Recetario/recetas/recetas
return if ($x/@dificultad="Facil")
then <Posible>{data($x/nombre)}</Posible>
else <Inviable>{data($x/nombre)}</Inviable>