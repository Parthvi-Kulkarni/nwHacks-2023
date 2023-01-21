const Router = require('express-promise-router');

const { getUser, createUser, updateUser } = require('./controllers/userController');

const router = Router();

// user
router.get('/user/:id', getUser);
router.post('/user', createUser);
router.put('/user', updateUser);


module.exports = router;