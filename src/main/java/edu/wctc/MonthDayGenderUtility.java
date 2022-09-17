package edu.wctc;

public class MonthDayGenderUtility {
     /*
    If the gender code does not match one of the constants, an UnknownGenderCodeException is thrown.
    If the year, month, and day of birth do not constitute a valid date (such as February 31st or December 47th),
    an InvalidBirthdayException is thrown.
    Returns (month - 1) * 40 + day + genderModConstant.
     */

    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException {
        int genderModConstant = 1;

        if (genderCode != CODE_MALE && genderCode != CODE_FEMALE) {
            throw new UnknownGenderCodeException(genderCode);
        } else {
            if (genderCode == CODE_MALE) {
                genderModConstant = MOD_MALE;
            } else {
                genderModConstant = MOD_FEMALE;
            }


        }

        if (month == 2 && day > 28) {
            throw new InvalidBirthdayException(year, month, day);
        } else if (year > 9999 || year < 1000) {
            throw new InvalidBirthdayException(year, month, day);
        } else if (month > 12 || month < 0) {
            throw new InvalidBirthdayException(year, month, day);
        } else if (day > 32 || day < 0) {
            throw new InvalidBirthdayException(year, month, day);
        }
        return (month - 1) * 40 + day + genderModConstant;
    }
}
