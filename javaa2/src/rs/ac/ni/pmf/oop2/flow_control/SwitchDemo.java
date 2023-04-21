package rs.ac.ni.pmf.oop2.flow_control;

import java.util.Locale;

public class SwitchDemo
{
	public static int numberOfDays(int month)
	{
		int days;

		switch (month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 28;
		}

		return days;
	}

//	public static int numberOfDays(String month)
//	{
//		int days = switch (month.toLowerCase(Locale.ROOT))
//			{
//				case "january", "march", "may", "july", "august", "october", "december" -> 31;
//				case "april", "june", "september", "november" -> 30;
//				case "february" -> 28;
//				default -> {
//					System.out.println("Month " + month + " is not recognized");
//					yield -1;
//				}
//			};
//
//		return days;
//	}

	public static void main(String[] args)
	{
//		System.out.println(numberOfDays("January"));
	}
}
