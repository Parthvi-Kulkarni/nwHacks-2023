const express = require("express");
const routes = require("./routes");
const db = require("./models");
const { UNAUTHORIZED } = require("./httpCodes");

const app = express();

app.use(express.json());

app.use(routes);

db.sequelize.sync();

const PORT = 8080;

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}.`);
});

module.exports = app;