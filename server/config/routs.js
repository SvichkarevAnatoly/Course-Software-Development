var mongoose = require('mongoose');

var usersSchema = mongoose.Schema({
			name:String, 
			age:Number, 
			work:String
		});
		var dbdata;
		
var users = mongoose.model('users', usersSchema);

module.exports = function(app){
	app.get('/', function(req, res){
		res.render('index.html');
	});

	app.get('/users', function(req, res){
		
		console.log(users.modelName);
		users.find({}, function(error, data){
			dbdata = data;
			res.json(dbdata);
		});	
		
	});
}
