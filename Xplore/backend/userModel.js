const {Sequelize, DataTypes} = require("sequelize");

const sequelize = new Sequelize(
   'users_db',
   'root', // MySQL username
   'rootBanana', // MySQL password
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

const User = sequelize.define("user", {
    id: {
        type: DataTypes.STRING,
        defaultValue: DataTypes.UUIDV4,
        allowNull: false,
        primaryKey: true
    },
    firstName: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: false
    },
    lastName: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: false
    },
    age: {
        type: DataTypes.INTEGER,
        defaultValue: 0,
        allowNull: false
    },
    profilePicture: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: false
    },
    currentCity: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: false
    },
    university: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: false
    },
    year: {
        type: DataTypes.INTEGER,
        defaultValue: 0,
        allowNull: false
    },
    major: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: false
    },
    minor: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: true
    },
    interests: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: false
    },
    dietaryRestrictions: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: true
    },
    question1: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: true
    },
    question2: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: true
    },
    question3: {
        type: DataTypes.STRING,
        defaultValue: "",
        allowNull: true
    }
});

sequelize.sync().then(() => {
   console.log('User table created successfully!');
}).catch((error) => {
   console.error('Unable to create table : ', error);
});

module.exports = User;