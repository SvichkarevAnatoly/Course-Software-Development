var mongoose = require('mongoose');

module.exports = function(config){
	mongoose.connect('mongodb://localhost/niggadb');
	var db = mongoose.connection;
	db.on('error', console.error.bind(console, 'connection error...'));
	db.once('open', function callback(){
		console.log('users db opened');
	});
}