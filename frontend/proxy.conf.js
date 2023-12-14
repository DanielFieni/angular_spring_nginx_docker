const PROXY_CONFIG = [
  {
    context: ['/locadora'],
    target: 'http://postgresqldb:8080/',
    secure: false,
    logLevel: 'debug'
  }
];

module.exports = PROXY_CONFIG;
