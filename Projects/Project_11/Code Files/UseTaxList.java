import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.text.DecimalFormat;

/**
*
*Provides methods for reading in data and generating reports.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
*
*/

public class UseTaxList {

//instance methods

   private String taxDistrict;
   private Vehicle[] vehicleList;
   private String[] excludedRecords;
      
//constructor

/**
*
*Initializes fields.
*
*/


   public UseTaxList() {
   
      taxDistrict = "not yet assigned";
      vehicleList = new Vehicle[0];
      excludedRecords = new String[0];
            
   }

/**
*
*Reads in the vehicle file.
*
*@param fileIn used
*@throws FileNotFoundException used
*
*/

   public void readVehicleFile(String fileIn) throws FileNotFoundException {
   
      Scanner input = new Scanner(new File(fileIn));
   
      taxDistrict = input.nextLine();
   
      while (input.hasNext()) {
      
         String infoLine = input.nextLine();
         Scanner scan = new Scanner(infoLine);
         
         
         
         scan.useDelimiter(";");
         try {
            char vType = scan.next().trim().toUpperCase().charAt(0);
            String ownerIn = scan.next().trim();
            String yearMakeModelIn = scan.next().trim();
            double valueIn = Double.parseDouble(scan.next().trim());
            boolean altFuelIn = Boolean.parseBoolean(scan.next().trim());
         
            Vehicle vehicleIn;
         
            switch (vType) {
            
               case 'C':
                  vehicleIn = new Car(ownerIn, yearMakeModelIn,
                     valueIn, altFuelIn);
                  addVehicle(vehicleIn);
               
                  break;
            
               case 'T': 
                  double tonsIn = Double.parseDouble(scan.next().trim());
                  vehicleIn = new Truck(ownerIn, yearMakeModelIn, valueIn,
                     altFuelIn, tonsIn);
                  addVehicle(vehicleIn);
               
                  break;
            
               case 'S':
                  tonsIn = Double.parseDouble(scan.next().trim());
                  int axlesIn = Integer.parseInt(scan.next().trim());
                  vehicleIn = new SemiTractorTrailer(ownerIn, yearMakeModelIn,
                     valueIn, altFuelIn, tonsIn, axlesIn);
                  addVehicle(vehicleIn);
               
                  break;
            
               case 'M':
                  double sizeIn = Double.parseDouble(scan.next().trim());
                  vehicleIn = new Motorcycle(ownerIn, yearMakeModelIn, valueIn,
                     altFuelIn, sizeIn);
                  addVehicle(vehicleIn);
                  break;
            
                        
            
               default:
               
                  String result = "Invalid Vehicle Category in: \n";
                  addExcludedRecord(result + infoLine);
               
                  break;
            
            }
         
         }
         
         catch (NegativeValueException e) {
         
            String output = e + "in: \n" + infoLine;
            addExcludedRecord(output);
         
         }
         
         catch (NumberFormatException e) {
         
            String output = e + " in: \n" + infoLine;
            addExcludedRecord(output);
         
         }
         
         catch (NoSuchElementException e) {
         
            String output = e + " in: \n" + infoLine;
            addExcludedRecord(output);
         
         }
      
      }   
                       
      input.close();
   
   }

/**
*
*Returns the tax district.
*
*@return getTaxDistrict
*
*/

   public String getTaxDistrict() {
   
      return taxDistrict;
   
   
   }


/**
*
*Sets the tax district.
*
*@param taxDistrictIn used
*
*/

   public void setTaxDistrict(String taxDistrictIn) {
   
      taxDistrict = taxDistrictIn;
   
   
   }

/**
*
*Returns the vehicle list array.
*
*@return vehicleList
*
*/

   public Vehicle[] getVehicleList() {
   
      return vehicleList;
   
   
   }

/**
*
*Returns the excluded list.
*
*
*@return excludedRecords
*
*/


   public String[] getExcludedRecords() {
   
      return excludedRecords;
   
   
   }

/**
*
*
*Adds a vehicle to the vehicle array.
*
*@param vehicleIn used
*
*/

   public void addVehicle(Vehicle vehicleIn) {
   
      vehicleList = Arrays.copyOf(vehicleList, vehicleList.length + 1);
      vehicleList[vehicleList.length - 1] = vehicleIn;
   
   
   }

/**
*
*Adds an exluded record to the excluded record array.
*
*@param excludedRecordsIn used
*
*/




   public void addExcludedRecord(String excludedRecordsIn) {
   
      excludedRecords = Arrays.copyOf(excludedRecords,
         excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = excludedRecordsIn;
   
   
   }

  /**
  *
  *Returns a toString summary.
  *
  *@return output
  *
  */
  
  
   public String toString() {
   
      String output = "";
      int index = 0;
      while (index < vehicleList.length) {
         output += "\n" + vehicleList[index].toString() + "\n";
         index++;
         
      } 
     
   
      return output;
   
   }

   /**
   *
   *Calculates the total use tax.
   *
   *@return Total Use Tax
   *
   */
   
   public double calculateTotalUseTax() {
   
      double useTax = 0;
      if (vehicleList.length != 0) {
      
         int index = 0;
         while (index < vehicleList.length) {
            useTax += vehicleList[index].useTax();
            index++;
         
         }         
      }
      
      else {
      
         useTax = 0;
      
      }
      return useTax;      
   
   }

   /**
   *
   *Calculates the total value of all vehicles.
   *
   *@return total value
   *
   */
   
   public double calculateTotalValue() {
   
      double totalValue = 0;
      if (vehicleList.length != 0) {
      
         int index = 0;
         while (index < vehicleList.length) {
            totalValue += vehicleList[index].getValue();
            index++;
         
         }         
      }
      
      else {
      
         totalValue = 0;
      
      }
      return totalValue; 
   
   
   }

   /**
   *
   *Returns a string summary.
   *
   *@return summary
   *
   */
   
   public String summary() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00"); 
   
      return "------------------------------\n"
         + "Summary for " + getTaxDistrict() 
         + "\n------------------------------\n"
         + "Number of Vehicles: " + vehicleList.length
         + "\nTotal Value: " + df.format(calculateTotalValue())
         + "\nTotal Use Tax: " + df.format(calculateTotalUseTax())
         + "\n";
   
   
   }
   
   /**
   *
   *Returns a string with vehicles listed by owner.
   *
   *@return listByOwner
   *
   */
   
   public String listByOwner() {
   
      String result = "";
      Arrays.sort(vehicleList);
      
      for (Vehicle v : vehicleList) {
      
         result += "\n" + v.toString() + "\n";
      
      }
   
      return "------------------------------\n"
         + "Vehicles by Owner" 
         + "\n------------------------------\n"
         + result;
   
   }
   
   /**
   *
   *Returns a string with vehicles listed by useTax.
   *
   *@return listByUseTax
   *
   */
   
   public String listByUseTax() {
   
      String result = "";
      Arrays.sort(vehicleList, new UseTaxComparator());
      
      for (Vehicle v : vehicleList) {
      
         result += "\n" + v.toString() + "\n";
      
      }
   
   
   
      return "------------------------------\n"
         + "Vehicles by Use Tax" 
         + "\n------------------------------\n"
         + result;
   
   
   }


   /**
   *
   *Returns a String with a list of excluded records.
   *
   *@return excludedRecordsList
   *
   */
   
   public String excludedRecordsList() {
   
      String result = "";
      
      for (String s : excludedRecords) {
      
         result += "\n" + s.toString() + "\n";
      
      }
   
   
      return "------------------------------\n"
         + "Excluded Records" 
         + "\n------------------------------\n"
            + result;
   
   }

}