"user strict";

const sequelize = require("sequelize");
const db = {};
const env = "development";
const config = require("Xplore/backend/config_user.json")[env];

let sequelize;
