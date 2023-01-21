const Router = require('express-promise-router');

const { getUser, createUser} = require('./controller/userController');

const router = Router();

// user
router.get('/user/:id', getUser);
router.post('/user', createUser);


module.exports = router;