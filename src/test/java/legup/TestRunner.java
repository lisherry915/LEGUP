package legup;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import puzzles.battleship.rules.AdjacentShipsContradictionRuleTest;
import puzzles.battleship.rules.FinishWithShipsDirectRuleTests;
import puzzles.lightup.rules.*;
import puzzles.minesweeper.MinesweeperUtilitiesTest;
import puzzles.nurikabe.rules.*;
import puzzles.treetent.rules.*;

/** This class runs all of the tests for the project without needing to run build scripts. */
public class TestRunner {
    public static void main(String[] args) {
        // Battleship Tests
        Result result1 = JUnitCore.runClasses(AdjacentShipsContradictionRuleTest.class);
        printTestResults(result1);
        Result result2 = JUnitCore.runClasses(FinishWithShipsDirectRuleTests.class);
        printTestResults(result2);

        // LightUp Tests
        Result result3 = JUnitCore.runClasses(BulbsInPathContradictionRuleTest.class);
        printTestResults(result3);
        Result result4 = JUnitCore.runClasses(CannotLightACellContradictionRuleTest.class);
        printTestResults(result4);
        Result result5 = JUnitCore.runClasses(EmptyCellinLightDirectRuleTest.class);
        printTestResults(result5);
        Result result6 = JUnitCore.runClasses(EmptyCornersDirectRuleTest.class);
        printTestResults(result6);
        Result result7 = JUnitCore.runClasses(FinishWithBulbsDirectRuleTest.class);
        printTestResults(result7);
        Result result8 = JUnitCore.runClasses(FinishWithEmptyDirectRuleDirectRuleTest.class);
        printTestResults(result8);
        Result result9 = JUnitCore.runClasses(LightOrEmptyCaseRuleTest.class);
        printTestResults(result9);
        Result result10 = JUnitCore.runClasses(MustLightDirectRuleTest.class);
        printTestResults(result10);
        Result result11 = JUnitCore.runClasses(SatisfyNumberCaseRuleTest.class);
        printTestResults(result11);
        Result result12 = JUnitCore.runClasses(TooFewBulbsContradictionRuleTest.class);
        printTestResults(result12);
        Result result13 = JUnitCore.runClasses(TooManyBulbsContradictionRuleTest.class);
        printTestResults(result13);

        // nurikabe tests
        Result result14 = JUnitCore.runClasses(BlackBetweenRegionsDirectRuleTest.class);
        printTestResults(result14);
        Result result15 = JUnitCore.runClasses(BlackBottleNeckDirectRuleTest.class);
        printTestResults(result15);
        Result result16 = JUnitCore.runClasses(BlackOrWhiteCaseRuleTest.class);
        printTestResults(result16);
        Result result17 = JUnitCore.runClasses(BlackSquareContradictionRuleTest.class);
        printTestResults(result17);
        Result result18 = JUnitCore.runClasses(CornerBlackDirectRuleTest.class);
        printTestResults(result18);
        Result result19 = JUnitCore.runClasses(FillinBlackDirectRuleTest.class);
        printTestResults(result19);
        Result result20 = JUnitCore.runClasses(FillinWhiteDirectRuleTest.class);
        printTestResults(result20);
        Result result21 = JUnitCore.runClasses(IsolateBlackContradictionRuleTest.class);
        printTestResults(result21);
        Result result22 = JUnitCore.runClasses(MultipleNumbersContradictionRuleTest.class);
        printTestResults(result22);
        Result result23 = JUnitCore.runClasses(NoNumbersContradictionRuleTest.class);
        printTestResults(result23);
        Result result24 = JUnitCore.runClasses(PreventBlackSquareDirectRuleTest.class);
        printTestResults(result24);
        Result result25 = JUnitCore.runClasses(SurroundRegionDirectRuleTest.class);
        printTestResults(result25);
        Result result26 = JUnitCore.runClasses(TooFewSpacesContradictionRuleTest.class);
        printTestResults(result26);
        Result result27 = JUnitCore.runClasses(TooManySpacesContradictionRuleTest.class);
        printTestResults(result27);
        Result result28 = JUnitCore.runClasses(WhiteBottleNeckDirectRuleTest.class);
        printTestResults(result28);

        // Treetent
        Result result29 = JUnitCore.runClasses(EmptyFieldDirectRuleTest.class);
        printTestResults(result29);
        Result result30 = JUnitCore.runClasses(FinishWithGrassDirectRuleTest.class);
        printTestResults(result30);
        Result result31 = JUnitCore.runClasses(FinishWithTentsDirectRuleTest.class);
        printTestResults(result31);
        Result result32 = JUnitCore.runClasses(LastCampingSpotDirectRuleTest.class);
        printTestResults(result32);
        Result result33 = JUnitCore.runClasses(NoTentForTreeContradictionRuleTest.class);
        printTestResults(result33);
        Result result34 = JUnitCore.runClasses(NoTreeForTentContradictionRuleTest.class);
        printTestResults(result34);
        Result result35 = JUnitCore.runClasses(SurroundTentWithGrassDirectRuleTest.class);
        printTestResults(result35);
        Result result36 = JUnitCore.runClasses(TreeForTentDirectRuleTest.class);
        printTestResults(result36);
        Result result37 = JUnitCore.runClasses(TentOrGrassCaseRuleTest.class);
        printTestResults(result37);

        // Minesweeper
        Result result38 = JUnitCore.runClasses(MinesweeperUtilitiesTest.class);
        printTestResults(result38);
    }

    private static void printTestResults(Result result) {
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Tests run: " + result.getRunCount());
        System.out.println("Tests failed: " + result.getFailureCount());
        System.out.println("All tests passed: " + result.wasSuccessful());
        System.out.println();
    }
}
