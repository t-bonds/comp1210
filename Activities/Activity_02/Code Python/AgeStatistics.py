"""
A program that displays someone's name,age and gender,
along with calculations for age in minutes and centuries
as well as max heart rate based on age and gender.

Tanner Bonds
8-2-17
"""

def main():
	ageInYears = 0
	gender = 0
	maxHeartRate = 0

	name = input('Enter your name: ')
	ageInYears = input('Enter your age in years: ')
	gender = input('Enter your gender (1 for female and 0 for male): ')

	print('Your age in minutes is' + ageInYears * 525600 + ' minutes.')
	print('Your age in centuries is' + ageInYears / 100 + ' centuries.')


main()
