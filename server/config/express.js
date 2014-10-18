var express = require('express');

module.exports = function(app, config){

//config application
app.set('views', config.rootPath + '/server/views');
app.engine('html', require('ejs').renderFile);
app.use(express.static(config.rootPath + '/public'));

};