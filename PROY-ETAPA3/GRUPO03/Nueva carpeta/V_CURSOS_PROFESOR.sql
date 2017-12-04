create view V_CURSOS_PROFESOR(
periodo, ciclo, cursoprog, curso, nomcurso, horario,
tarifa, nomtarifa, precio, pagohora, horas, vacantes,
matriculados, ingresos, pagoprofesor, profesor,
nomprofesor, activo
) as
SELECT left(cp.idciclo,4), cp.IdCiclo, cp.IdCursoProg,
cp.IdCurso, c.NomCurso, cp.Horario, c.IdTarifa,
t.Descripcion, t.PrecioVenta, t.PagoHora, t.Horas,
cp.Vacantes, cp.Matriculados, t.PrecioVenta * cp.Matriculados,
t.Horas * t.PagoHora, isnull(cp.IdProfesor,''),
isnull(p.ApeProfesor + ', ' + p.NomProfesor,''), 
cp.Activo
FROM Tarifa t
join Curso c on t.IdTarifa = c.IdTarifa
join CursoProgramado cp on c.IdCurso = cp.IdCurso
left join Profesor p on cp.IdProfesor = p.IdProfesor
GO


select count(*) 
from CursoProgramado
where IdProfesor is null;
GO

select * from V_CURSOS_PROFESOR;
GO







