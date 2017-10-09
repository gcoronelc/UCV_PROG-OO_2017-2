select * from tarifa;
select * from curso;


select c.IdCurso, t.IdTarifa, t.Descripcion nomtarifa,
	c.NomCurso, t.PrecioVenta, t.Horas, t.PagoHora
from Tarifa t join Curso c
on t.IdTarifa = c.IdTarifa
where t.IdTarifa = 'C';
