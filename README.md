🚗 Gestión de Automóviles en Java con NetBeans
Este proyecto es una aplicación Java con interfaz gráfica (IGU) que permite consultar, dar de alta y modificar automóviles. Está estructurado en tres capas: Interfaz Gráfica (IGU), Lógica de Negocio, y Persistencia, siguiendo buenas prácticas de diseño y separación de responsabilidades.

🧱 Estructura del Proyecto
IGU (Interfaz Gráfica): Ventanas y formularios para interacción con el usuario.
Lógica: Contiene la clase Automovil y la lógica de negocio.
Persistencia: Gestiona el acceso a la base de datos mediante JPAController.
🛠️ Funcionalidades
🔍 Consultar Automóviles: Visualizar los registros existentes.
➕ Alta de Automóvil: Crear nuevos registros desde la interfaz.
✏️ Modificar Automóvil: Editar datos de automóviles ya registrados.
🧰 Tecnologías Utilizadas
Java SE
NetBeans IDE
Swing (para la interfaz gráfica)
JPA (Java Persistence API)
Base de datos relacional (MySQL, Derby, etc.)
📦 Organización de Paquetes
src/ 
├── igu/ ← Ventanas y componentes gráficos 
├── logica/ ← Clase Automovil y lógica de negocio 
└── persistencia/ ← JPAController y entidades

🚀 Cómo Ejecutar
Clona o descarga el proyecto.
Abre el proyecto en NetBeans.
Configura la conexión a la base de datos en la capa de persistencia.
Ejecuta la clase principal desde la carpeta igu.
📄 Licencia
Este proyecto es de uso libre para fines educativos y personales.
