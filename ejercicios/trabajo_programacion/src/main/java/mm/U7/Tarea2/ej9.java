//package mm.U7.Tarea2;
//
//public class ej9 {
//    public static void main(String[] args) {
//
//        Set union(Set conjunto1, Set conjunto2) {
//            Set resultado;
//            resultado.numElementos = 0;
//
//            // Copiar elementos del conjunto1
//            for(int i = 0; i < conjunto1.numElementos; i++) {
//                resultado.elementos[resultado.numElementos++] = conjunto1.elementos[i];
//            }
//
//            // Añadir elementos de conjunto2 si no están ya
//            for(int i = 0; i < conjunto2.numElementos; i++) {
//                int existe = 0;
//
//                for(int j = 0; j < resultado.numElementos; j++) {
//                    if(conjunto2.elementos[i] == resultado.elementos[j]) {
//                        existe = 1;
//                        break;
//                    }
//                }
//
//                if(!existe) {
//                    resultado.elementos[resultado.numElementos++] = conjunto2.elementos[i];
//                }
//            }
//
//            return resultado;
//        }
//    }
//}
