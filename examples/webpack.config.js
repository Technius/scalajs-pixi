var config = require("./scalajs.webpack.config");
config.module.loaders = [
    {
        test: /\.json$/,
        loader: "json-loader"
    }
];
config.node = (config.node || {});
config.node.fs = "empty";
module.exports = config;
