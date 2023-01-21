const UserObject = (sequelize, DataTypes) => {
    const User = sequelize.define("User", {
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
            defaultValue: "",
            allowNull: false
        },
        profilePicture: {
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
            type: DataTypes.STRING,
            defaultValue: "",
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
    }, {
        timestamps: false,
    }
    );
    return User;
};

module.exports = UserObject