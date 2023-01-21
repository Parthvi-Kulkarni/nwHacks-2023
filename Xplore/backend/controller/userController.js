const { User, Preference } = require("../models");
const axios = require("axios");
const {
  OK,
  CREATED,
  INTERNAL_SERVER_ERROR,
  UNAUTHORIZED,
  NOT_FOUND,
  BAD_REQUEST
} = require("../httpCodes");

const getUser = async (req, res) => {
  const userId = req.params.userId;
  const response = await User.findByPk(userId);
  if (response) {
    res.json(JSON.parse(JSON.stringify({ user: response })));
  } else {
    res.status(NOT_FOUND).json({message:"User not Found!"});
  }
};

const createUser = async (req, res) => {
  const hasAllFields = req.body.firstName && req.body.lastName && req.body.age && req.body.profilePicture && req.body.university && req.body.year && req.body.major && req.body.interests;
  const validProfilePic = req.body.profilePicture.includes(".com");
  console.log(req.body);
  if (hasAllFields && validProfilePic) {
    const response = await User.create(
      {
        id: req.body.id,
        firstName: req.body.firstName,
        lastName: req.body.lastName,
        age: req.body.age,
        profilePicture: req.body.profilePicture,
        university: req.body.university,
        year: req.body.year,
        major: req.body.major,
        minor: req.body.minor,
        interests: req.body.interests,
        dietaryRestrictions: req.body.dietaryRestrictions,
        question1: req.body.question1,
        question2: req.body.question2,
        question3: req.body.question3
      }
    );
    res.status(CREATED).json(JSON.parse(JSON.stringify(response)));
  } else {
    res.sendStatus(BAD_REQUEST);
  }
};

module.exports = {
  getUser,
  createUser
};