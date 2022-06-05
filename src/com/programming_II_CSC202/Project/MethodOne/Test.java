//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<String> stringArrayList = new ArrayList<>();
////        MedicalMapper medicalMapper = new MedicalMapper();
//        String filePath = "/home/moutasim/IdeaProjects/University-courses/src/com/programming_II_CSC202/Project/medicalRecords.txt";
//
//        try { // Methodology: Store in string, split on spaces, covert to int or double,
//            // add to the variables directly from the Arraylist.
//            Scanner input = new Scanner(new File(filePath));
//            FileWriter converted = new FileWriter("/home/moutasim/IdeaProjects/University-courses/src/com/programming_II_CSC202/Project/convertedMedicalRecords.txt");
//
//            while (input.hasNext()) {
//                if (input.hasNextInt()) {
//                    stringArrayList.add(String.valueOf(input.nextInt()));
//                } else if (input.hasNextDouble()) {
//                    stringArrayList.add(String.valueOf(input.nextDouble()));
//                } else {
//                    input.next();
//                }
//            }
//
//            // pid age gender weight height sbp dbp fbs chol ldl hdl tg hba1c
//
//            for (int i = 0; i < stringArrayList.size(); i++) {
//
//                converted.write(stringArrayList.get(i)); // Pid
//                converted.write(" ");
//                i++;
//
//                converted.write(stringArrayList.get(i)); // Age
//                converted.write(" ");
//                i++;
//
//                medicalMapper.setGender(Integer.parseInt(stringArrayList.get(i)));
//                converted.write(medicalMapper.convertGender(medicalMapper.getGender())); // Gender
//                converted.write(" ");
//                i++;
//
//                medicalMapper.setWeight(Double.parseDouble(stringArrayList.get(i)));// Weight
//                i++;
//                medicalMapper.setHeight(Double.parseDouble(stringArrayList.get(i)));// Height
//                converted.write(String.valueOf((int) medicalMapper.mapBMI(medicalMapper.getBMI()))); //BMI
//                converted.write(" ");
//                i++;
//
//                medicalMapper.setSbp(Integer.parseInt(stringArrayList.get(i))); // Sbp
//                i++;
//                medicalMapper.setDbp(Integer.parseInt(stringArrayList.get(i))); // Dbp
//                converted.write(String.valueOf(medicalMapper.mapBloodPressure())); // mapBloodPressure
//                converted.write(" ");
//                i++;
//
//                medicalMapper.setFbs(Double.parseDouble(stringArrayList.get(i)));
//                converted.write(String.valueOf(medicalMapper.mapFBS(medicalMapper.getFbs()))); // FBS
//                converted.write(" ");
//                i++;
//
//                medicalMapper.setChol(Double.parseDouble(stringArrayList.get(i)));
//                converted.write(String.valueOf(medicalMapper.mapCholesterol(medicalMapper.getChol()))); // Cholestrol
//                converted.write(" ");
//                i++;
//
//                medicalMapper.setLdl(Double.parseDouble(stringArrayList.get(i)));
//                converted.write(String.valueOf(medicalMapper.mapLDL(medicalMapper.getLdl()))); // LDL
//                converted.write(" ");
//                i++;
//
//                medicalMapper.setHdl(Double.parseDouble(stringArrayList.get(i)));
//                converted.write(String.valueOf(medicalMapper.mapHDL(medicalMapper.getHdl()))); // HDL
//                converted.write(" ");
//                i++;
//
//                medicalMapper.setTg(Double.parseDouble(stringArrayList.get(i)));
//                converted.write(String.valueOf(medicalMapper.getTG(medicalMapper.getTg()))); // TG
//                converted.write(" ");
//                i++;
//
//                medicalMapper.setHba1c(Double.parseDouble(stringArrayList.get(i)));
//                converted.write(String.valueOf(medicalMapper.mapHB1AC(medicalMapper.getHba1c()))); // HB1AC
//                converted.write(" ");
//
//                converted.write(String.valueOf(medicalMapper.getTotal()));
//                converted.write("\n");
//            }
//            converted.close();
//
////            System.out.println(medicalMapper.toString());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
