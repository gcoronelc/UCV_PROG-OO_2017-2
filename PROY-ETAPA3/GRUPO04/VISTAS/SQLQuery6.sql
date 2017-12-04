USE [EduTec]
GO

/****** Object:  View [dbo].[V_CURSOS_PROFESOR]    Script Date: 12/4/2017 9:01:49 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

Create view [dbo].[V_CURSOS_PROFESOR](
periodo, ciclo, cursoprog, curso, nomcurso, horario,
tarifa, nomtarifa, precio, pagohora, horas, vacantes,
matriculados, ingresos, pagoprofesor, profesor,
nomprofesor, activo
)as
SELECT left(cp.idciclo,4), cp.IdCiclo, cp.IdCursoProg,
cp.IdCurso, c.NomCurso, cp.Horario, c.IdTarifa,
t.Descripcion, t.PrecioVenta, t.PagoHora, t.Horas,
cp.Vacantes, cp.Matriculados, t.PrecioVenta*cp.Matriculados,
t.Horas*t.PagoHora, isnull (cp.IdProfesor, ''),

isnull(p.ApeProfesor + ', ' + p.NomProfesor,''),
cp.Activo
from Tarifa t
join Curso c on t.IdTarifa=c.IdTarifa
join CursoProgramado cp on c.IdCurso=cp.IdCurso
left join Profesor p on cp.IdProfesor=p.IdProfesor
GO


