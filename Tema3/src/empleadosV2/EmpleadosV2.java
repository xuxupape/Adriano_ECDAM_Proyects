package empleadosV2;

public class EmpleadosV2 {
	
		private  String nombre,msj;
		private int telefono;
		static private int numEmpleados;
	
		EmpleadosV2(String nombre, int telefono){
			this.nombre=nombre;
			this.telefono=telefono;
			numEmpleados++;
		}
		
		EmpleadosV2(EmpleadosV2 copia){
			this.nombre=copia.getNombre();
			this.telefono=copia.getTelefono();
		}
		
		public String iguales(EmpleadosV2 e1, EmpleadosV2 e2) {
			
			if(e1.equals(e2)) {
				msj = "Los objetos pasados por parámetros son iguales";
			}else msj = "Los objetos pasado por parámetros son diferentes";
			
			return msj;
		}
		
		public int setTelefono(int telefono) {
			this.telefono=telefono;
			return telefono;
		}
		
		public String setNombre(String nombre) {
			this.nombre=nombre;
			return nombre;
		}
		
		public int getTelefono() {
			return telefono;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public static int getEmpleados() {
			return numEmpleados;
		}


}
