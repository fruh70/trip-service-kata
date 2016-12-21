# PHP

In order to perform the kata, first of all you will need to install all of the dependencies. This can be done using
composer (standing from the *"php"* directory")

```shell
wget http://getcomposer.org/composer.phar
php composer.phar install
```

Next, to execute the unit tests you need run this from the *php* directory

    bin/phpunit

## Coverage

If your IDE doesn't handle it you can launch and visualize it from the command line. Given you are in  the *php* folder
just run

    bin/phpunit --coverage-text --whitelist src

If you want to visualize it from the browser you have to run PHPUnit with this parameters

    bin/phpunit --coverage-html report/ --whitelist src

Then open report/index.html in a browser. For instance

    open report/index.html       # MacOS
    firefox report/index.html    # windows/linux

Enjoy

