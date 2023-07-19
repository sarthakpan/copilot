var months = [
	'January',
	'February',
	'March',
	'April',
	'May',
	'June',
	'July',
	'August',
	'September',
	'October',
	'November',
	'December',
];
var days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];

// function to convert date to string
function dateToString(date) {
	return days[date.getDay()] + ', ' + date.getDate() + ' ' + months[date.getMonth()] + ' ' + date.getFullYear();
}

function sumOfDates(date1, date2) {
	// Convert the dates to milliseconds, add them, and convert the sum back to a date object
	var sum = new Date(date1).getTime() + new Date(date2).getTime();
	// Check for invalid date
	if (isNaN(sum)) {
		throw new Error('Invalid date');
	}
	// Convert the date object to a string and return it
	return dateToString(new Date(sum));
}


// describe('test sampleJS', function () {
// 	it('test sampleJS.sumOfDates', function (done) {
// 		assert.equal(sampleJS.sumOfDates('2014-01-01', '2014-01-01'), '2014-01-02');
// 		done();
// 	});
// });