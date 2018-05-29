'use strict';
module.exports = (sequelize, DataTypes) => {
  var User = sequelize.define('User', {
    id: {
      type: DataTypes.INTEGER,
      primaryKey: true,
      autoIncrement: true
    },
    name: DataTypes.STRING,
    cpf: DataTypes.DECIMAL(11,0),
    date_of_birth: DataTypes.DATE,
  }, {
    timestamps: false
  });
  User.associate = function(models) {
    // associations can be defined here
  };
  return User;
};