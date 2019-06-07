package assignment8;

public class Sstudent extends Student{
        private int units;

        public Sstudent(String name,String lastname,int studentNumber,int units) {
            this.units = units;
            this.setName(name);
            this.setLastName(lastname);
            this.setStudentNumber(studentNumber);
        }
        public Sstudent(){

        }

        public int getUnits() {
            return units;
        }

        public void setUnits(int units) throws WrongUnitsNumber {
            if(units>=250){
                throw new WrongUnitsNumber();
            }else {
                this.units = units;
            }
        }

        public class WrongUnitsNumber extends Throwable {
            public WrongUnitsNumber(){
                super("worng units => units most be smaller than 250");
            }
        }

        @Override
        public String toString() {
            String info = String.format("Study\t%s\t%s\t%d\t%d\n",this.getName(),this.getLastName(),this.getStudentNumber(),this.getUnits());
            return info;
        }
    }

