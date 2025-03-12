
---

### 📌 **Convenciones de Commit (Conventional Commit)**

Aquí tienes un resumen de los tipos de mensajes de commit según la convención **Conventional Commit**:

- `feat`: Se utiliza cuando introduces una nueva funcionalidad.
- `fix`: Se utiliza cuando corriges un error.
- `docs`: Para cambios o mejoras en la documentación.
- `style`: Cambios que no afectan la funcionalidad, como mejorar la indentación o los nombres de las variables.
- `refactor`: Modificaciones en el código que no cambian su funcionalidad pero mejoran la estructura.
- `perf`: Cambios que mejoran el rendimiento.
- `test`: Añadir o modificar pruebas.
- `chore`: Tareas que no afectan la funcionalidad (ej. cambios de configuración).
- `build`: Modificaciones relacionadas con la construcción del proyecto (ej. cambios en los archivos de configuración de Maven/Gradle).
- `ci`: Cambios en los archivos de configuración de CI/CD.

### Ejemplo de Commit

Si haces un cambio en la vista (HTML) del proyecto, un buen mensaje de commit siguiendo las convenciones podría ser:

```bash
git commit -m "feat: agregar vista de usuarios con Thymeleaf"
```

