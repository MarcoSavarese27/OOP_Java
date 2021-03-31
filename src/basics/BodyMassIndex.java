package basics;
import Classi.Persona;
/**
 * Write a program that calculates and displays a person's body mass index
 * (BMI). A person's BMI is calculated with the following formula: BMI = weight
 * (kg) / height (m) ^ 2. Display a message indicating whether the person has
 * optimal weight, is underweight, or is overweight. A sedentary person's weight
 * is considered optimal if his or her BMI is between 18.5 and 25. If the BMI is
 * less than 18.5, the person is considered underweight. If the BMI value is
 * greater than 25, the person is considered overweight.
 *
 * @author Justin Musgrove
 */
public class BodyMassIndex {
    public static void main(String[] args){
        Persona carloseltopoquegira = new Persona("Carlos", "El topo que gira",15, 50, 1.80);
        System.out.println(carloseltopoquegira.getNome()+ " " + carloseltopoquegira.getCognome() + " è " + carloseltopoquegira.BMI());
    }

}

