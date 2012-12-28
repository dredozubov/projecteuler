//
//  main.m
//  euler4 - Palindromes
//
//  Created by Denis Redozubov on 14.11.12.
//  Copyright (c) 2012 Denis Redozubov. All rights reserved.
//

#import <Foundation/Foundation.h>

bool ispalindrome(int num) {
    char buffer[11];
    sprintf(buffer, "%d", num);
    size_t len = strlen(buffer);
    for (int i = 0; i < len/2; i++) {
        if (buffer[i] != buffer[len-i-1]) return false;
    }
    return true;
};

int maxpalindrome() {
    int max = -1;
    for (int i = 1000; i > 99; --i) {
        for (int j = i; j > 99; --j) {
            if (ispalindrome(i*j)) {
                max = MAX(i*j, max);
            }
        }
    }
    return max;
};

int main(int argc, const char * argv[])
{

    @autoreleasepool {
        
        // insert code here...
        NSLog(@"largest palindrome is: %d", maxpalindrome());
        NSLog(@"%d", INT_MAX);
        
    }
    return 0;
}

