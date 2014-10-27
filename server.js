var express = require('express'),
	mongoose = require('mongoose');

var app = express();

var config = {
	rootPath: __dirname,
	port: '1337'
}

require('./server/config/express')(app, config);
require('./server/config/mongoose')(config);
require('./server/config/routs')(app);

app.listen(config.port);