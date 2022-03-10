public class Project1Trace {
public static void main(String[] args)
{
final int MAX_PEOPLE_PER_SHELTER = 100;
final int MAX_HOUSEHOLDS_PER_ELECTRICIAN = 40;
final int AVG_RESIDENTS = 4;
final double PERCENT_PETS = 0.35;
int numPeople;
int numPets;
int numShelters;
int numHouseholds;
int numElectricians;
int numExtra;
Scanner scnr = new Scanner(System.in);
System.out.println("How many households in the county are without power?");
numHouseholds = scnr.nextInt();
numPeople = numHouseholds * AVG_RESIDENTS;
numPets = (int)(numHouseholds * PERCENT_PETS);
System.out.println("There are approximately " + numPeople + " people without
power.");
System.out.println("There are approximately " + numPets + " pets that need to
be kept warm.");
numShelters = numPeople + numPets / MAX_PEOPLE_PER_SHELTER + 1;
System.out.println("The county needs to open " + numShelters + " emergency
shelters for those without power.");
numElectricians = numHouseholds / MAX_HOUSEHOLDS_PER_ELECTRICIAN;
numExtra = numHouseholds % MAX_HOUSEHOLDS_PER_ELECTRICIAN;
System.out.println(numElectricians + " electrician crews are needed to
restore power to " + numExtra + " families. \nThere are " +
numHouseholds + " households that will not be taken care of
today.");
}
}