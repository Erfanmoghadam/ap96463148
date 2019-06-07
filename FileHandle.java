package assignment8;
import java.io.*;
import java.util.ArrayList;

public class FileHandle {

        private static File file =  new File("students.txt");;
        public static void addStudent(Student student) throws IOException{
            FileWriter fileWriter = new FileWriter(file,true);
            if(student instanceof Gstudents){
                fileWriter.write(student.toString());
            }else if(student instanceof Sstudent){
                fileWriter.write(student.toString());
            }
            fileWriter.close();
        }
        public static ArrayList<Student> ReadStudents() throws Exception{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            ArrayList<Student> students = new ArrayList<>();
            while(line!=null){
                String[] info = line.split("\t");
                if(info[0].equals("Study")){
                    Sstudent student = new Sstudent(info[1],info[2],Integer.valueOf(info[3]),Integer.valueOf(info[4]));
                    students.add(student);
                }else{
                    Gstudents student = new Gstudents(info[1],info[2],Integer.valueOf(info[3]),Integer.valueOf(info[4]));
                    students.add(student);
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            return students;
        }
    }

