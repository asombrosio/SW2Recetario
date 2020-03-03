for $x in 
doc("./files/xml/recetario1.xml")/Recetario/recetas/recetas
where $x/precio>2
order by $x/nombre
return $x