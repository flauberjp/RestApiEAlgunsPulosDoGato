'use strict';
module.exports = {
  up: (queryInterface, Sequelize) => {
    return queryInterface.createTable('Todos', {
      id: {
        type: Sequelize.INTEGER,
        primaryKey: true,
        allowNull: false
      },
      title: {
        type: Sequelize.STRING
      },
      description: {
        type: Sequelize.STRING
      },
      define: {
        timestamps: false
      }
    });
  },
  down: (queryInterface, Sequelize) => {
    return queryInterface.dropTable('Todos');
  }
};