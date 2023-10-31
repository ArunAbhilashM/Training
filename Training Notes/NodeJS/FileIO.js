var fs = require('fs');

fs.readFile('data.txt', 'utf8', function (err, data) {
    if (err) {
        console.error('Error reading the file:', err);
        return;
    }

    console.log('contents of data.txt:\n' + data);
    console.log('There are ' + data.length + ' characters in the file');
});

