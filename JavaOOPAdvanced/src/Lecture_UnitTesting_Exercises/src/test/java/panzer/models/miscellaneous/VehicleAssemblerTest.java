package panzer.models.miscellaneous;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import panzer.contracts.Assembler;
import panzer.contracts.AttackModifyingPart;
import panzer.contracts.DefenseModifyingPart;
import panzer.contracts.HitPointsModifyingPart;
import java.math.BigDecimal;

public class VehicleAssemblerTest {

    //work with interface
    private Assembler vehicleAssembler;

    private AttackModifyingPart attackModifyingPart;

    private DefenseModifyingPart defenseModifyingPart;

    private HitPointsModifyingPart hitPointsModifyingPart;

    @Before
    public void setUp(){
        // Inicializate Base Class
        this.vehicleAssembler = new VehicleAssembler();

        // Mock other classes
        this.attackModifyingPart = Mockito.mock(AttackModifyingPart.class);
        this.defenseModifyingPart = Mockito.mock(DefenseModifyingPart.class);
        this.hitPointsModifyingPart = Mockito.mock(HitPointsModifyingPart.class);

        // Вече си имам по една част в колекцийте, преди всеки тест
        this.vehicleAssembler.addArsenalPart(this.attackModifyingPart);
        this.vehicleAssembler.addShellPart(this.defenseModifyingPart);
        this.vehicleAssembler.addEndurancePart(this.hitPointsModifyingPart);
    }

    @Test
    public void getTotalWeight() {
        //Arrange
        Mockito.when(this.attackModifyingPart.getWeight()).thenReturn(10.0);
        Mockito.when(this.defenseModifyingPart.getWeight()).thenReturn(20.0);
        Mockito.when(this.hitPointsModifyingPart.getWeight()).thenReturn(30.0);

        //Act
        double actualTotalWeight = this.vehicleAssembler.getTotalWeight();
        double expected = 60.0;

        //Assert
        Assert.assertEquals(expected, actualTotalWeight, 0.1);
    }

    @Test
    public void getTotalPrice() {
        //Arrange
       Mockito.when(this.attackModifyingPart.getPrice()).thenReturn(BigDecimal.TEN);
       Mockito.when(this.defenseModifyingPart.getPrice()).thenReturn(BigDecimal.TEN);
       Mockito.when(this.hitPointsModifyingPart.getPrice()).thenReturn(BigDecimal.TEN);

       //Act
        BigDecimal atual = this.vehicleAssembler.getTotalPrice();
        BigDecimal expected = BigDecimal.valueOf(30);

        //Assert
        Assert.assertEquals(expected, atual);
    }

    @Test
    public void getTotalAttackModification() {
        //Arrange
        // На създаденото Мокито му ретървам стойност
        Mockito.when(this.attackModifyingPart.getAttackModifier()).thenReturn(10);

        // Create second Mockito Object, and return value
        AttackModifyingPart currentAttacPart = Mockito.mock(AttackModifyingPart.class);
        Mockito.when(currentAttacPart.getAttackModifier()).thenReturn(10);

        // Адвам и втория обект в листа
        this.vehicleAssembler.addArsenalPart(attackModifyingPart);

        //Act
        long actualtotalAttackModification = this.vehicleAssembler.getTotalAttackModification();
        long expectedAttackModification = 20;

        //Assert
        Assert.assertEquals(expectedAttackModification, actualtotalAttackModification);
    }

    @Test
    public void getTotalDefenseModification() {
       //Arrange
        Mockito.when(this.defenseModifyingPart.getDefenseModifier()).thenReturn(20);

        DefenseModifyingPart defensPart = Mockito.mock(DefenseModifyingPart.class);
        Mockito.when(defensPart.getDefenseModifier()).thenReturn(30);
        this.vehicleAssembler.addShellPart(defensPart);

        //Act
        long actualDefensPart = vehicleAssembler.getTotalDefenseModification();
        long expectedDefensPart = 50;
        //Assert
        Assert.assertEquals(expectedDefensPart, actualDefensPart);
    }

    @Test
    public void getTotalHitPointModification() {
        //Arrange
        Mockito.when(this.hitPointsModifyingPart.getHitPointsModifier()).thenReturn(30);

        HitPointsModifyingPart hitPointsPart = Mockito.mock(HitPointsModifyingPart.class);
        Mockito.when(hitPointsPart.getHitPointsModifier()).thenReturn(70);
        this.vehicleAssembler.addEndurancePart(hitPointsPart);

        //Act
        long actuallHitPointModification = this.vehicleAssembler.getTotalHitPointModification();
        long expectedHitPointModification = 100;

        //Assert
        Assert.assertEquals(expectedHitPointModification, actuallHitPointModification);
    }

    @Test
    public void addArsenalPart() {
        //Arrange
        Assembler assembler = new VehicleAssembler();
        AttackModifyingPart part1 = Mockito.mock(AttackModifyingPart.class);
        AttackModifyingPart part2 = Mockito.mock(AttackModifyingPart.class);
        Mockito.when(part1.getAttackModifier()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(part2.getAttackModifier()).thenReturn(Integer.MAX_VALUE);

        //Act
        assembler.addArsenalPart(part1);
        assembler.addArsenalPart(part2);
        long actual = assembler.getTotalAttackModification();
        long expected = (long)Integer.MAX_VALUE + Integer.MAX_VALUE;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShellPart() {
        //Arrange
        Assembler assembler = new VehicleAssembler();
        DefenseModifyingPart part1 = Mockito.mock(DefenseModifyingPart.class);
        DefenseModifyingPart part2 = Mockito.mock(DefenseModifyingPart.class);
        Mockito.when(part1.getDefenseModifier()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(part2.getDefenseModifier()).thenReturn(Integer.MAX_VALUE);

        //Act
        assembler.addShellPart(part1);
        assembler.addShellPart(part2);
        long actual = assembler.getTotalDefenseModification();
        long expected = (long)Integer.MAX_VALUE + Integer.MAX_VALUE;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addEndurancePart() {
        //Arrange
        Assembler assembler = new VehicleAssembler();
        HitPointsModifyingPart part1= Mockito.mock(HitPointsModifyingPart.class);
        HitPointsModifyingPart part2 = Mockito.mock(HitPointsModifyingPart.class);
        Mockito.when(part1.getHitPointsModifier()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(part2.getHitPointsModifier()).thenReturn(Integer.MAX_VALUE);

        //Act
        assembler.addEndurancePart(part1);
        assembler.addEndurancePart(part2);
        long actual = assembler.getTotalHitPointModification();
        long expected = (long)Integer.MAX_VALUE + Integer.MAX_VALUE;

        //Assert
        Assert.assertEquals(expected, actual);
    }
}