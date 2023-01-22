const express = require("express");
const Sequelize = require("sequelize");
const routes = require("./routes");
const app = express();

app.use(express.json());

app.use(routes);

app.get('/', function(req, res) {
  res.send('Hello World!');
})

app.listen(8080, function() {
  console.log('Example app listening on port 8080')
})

const sequelize = new Sequelize(
 'user_db',
 'nwHacks2023', // MySQL username
 'nwHacks2023', // MySQL password
  {
    host: '127.0.0.1',
    dialect: 'mysql'
  }
);

sequelize.authenticate().then(() => {
    console.log('Connection has been established successfully.');
 }).catch((error) => {
    console.error('Unable to connect to the database: ', error);
 });

module.exports = app;