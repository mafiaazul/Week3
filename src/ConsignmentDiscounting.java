start
    Declarations
        int price = 0;
        final int NUMBER_OF_WEEKS = 6;
        final double DISCOUNT_PER_WEEK = 0.12;
        final double MIN_PRICE = 0.99;

    Output "Enter product's full price: "
    Input price

    for(int counter = 1; counter <= NUMBER_OF_WEEKS; counter++) 
        if (price <= MIN_PRICE)
            Output "This product can't be discounted!"
            counter = NUMBER_OF_WEEKS + 1
        else if 
            Output "Price week " + counter + ": " + price
            price = price - (price * DISCOUNT_PER_WEEK)
        endif
    endfor

stop