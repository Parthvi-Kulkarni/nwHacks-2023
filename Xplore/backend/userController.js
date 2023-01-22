const User = require('./userModel');

const getUser = async (req, res) => {
  const id = req.params.id;
  const response = await User.findByPk(id);
  if (response) {
    res.json(JSON.parse(JSON.stringify({ user: response })));
  } else {
    res.status(NOT_FOUND).json({message:"User not Found!"});
  }
};

const createUser = async (req, res) => {
    const hasAllFields = true; 
    // const hasAllFields = req.body.firstName && req.body.lastName && req.body.age && req.body.profilePicture && req.body.currentCity && req.body.university && req.body.year && req.body.major && req.body.interests;
    // const validProfilePic = req.body.profilePicture.includes(".com");
    const validProfilePic = true;
    console.log(req.body);
    if (hasAllFields && validProfilePic) {
      const response = await User.create(
        {
          id: req.body.id,
          firstName: req.body.firstName,
          lastName: req.body.lastName,
          age: req.body.age,
          profilePicture: req.body.profilePicture,
          currentCity: req.body.currentCity,
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
      res.status(201).json(JSON.parse(JSON.stringify(response)));
    } else {
      res.sendStatus(400);
    }
  };

  const updateUser = async (req, res) => {
    const hasAllFields = req.body.firstName && req.body.lastName && req.body.age && req.body.profilePicture && req.body.currentCity && req.body.university && req.body.year && req.body.major && req.body.interests;
    const validProfilePic = true;
  
    if (hasAllFields && validProfilePic) {
      const response = await User.update(
        {
          firstName: req.body.firstName,
          lastName: req.body.lastName,
          age: req.body.age,
          profilePicture: req.body.profilePicture,
          currentCity: req.body.currentCity,
          university: req.body.university,
          year: req.body.year,
          major: req.body.major,
          minor: req.body.minor,
          interests: req.body.interests,
          dietaryRestrictions: req.body.dietaryRestrictions,
          question1: req.body.question1,
          question2: req.body.question2,
          question3: req.body.question3
        }, {where: {id: req.body.id}}
      );
      res.status(200).json(JSON.parse(JSON.stringify(response)));
    } else {
      res.sendStatus(400);
    }
  }

  module.exports = {
    getUser,
    createUser,
    updateUser
  }