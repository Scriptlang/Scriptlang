{
/*-----------*/
/* VARIABLES */
/*-----------*/
auto v;         /* Needs inferring */
v = 10;         /* Now inferred    */
u32 v;          /* Explicit        */
auto v = 10;    /* Inferred        */
u32 v = 20;     /* Explicit        */

/*-------------------*/
/* INTEGER CONSTANTS */
/*-------------------*/
10;
10i64;
10u8;
10u12;    /* Special kind of constant. It's an unsigned 16 bit value capped to 12 bits only */
0b1010u4; /* Infers into an u8 data type literal                                            */
0x1000u8; /* Loses the top 8 bits                                                           */

/*------------*/
/* DATA TYPES */
/*------------*/
u8 v;
u16 v;
u32 v;
u64 v;
i8 v;
i16 v;
i32 v;
i64 v;
f32 v;
f64 v;
bool v;
char v;
usize v;
isize v;
auto v;
array v;

/* We may declare new datatypes like this: */
typedef i32 int;

/*--------*/
/* ARRAYS */
/*--------*/
u8 arr1 = [1, 2, 3];                    /* Array of just integers      */
array arr2 = [1, 'a', "test", ls, pwd]; /* Array of multiple datatypes */

/*---------------*/
/* ARRAY SLICING */
/*---------------*/
arr = ['a', 'b', 'c'];
slice = arr[0:50]   /* From 0 to 50, exclusive                                   */
slice = arr[5:10:2] /* From 5 to 10, exclusive, steps 2 values through the array */
whole = arr[:]      /* Whole array                                               */
whole = arr[::3]    /* Whole array, steps 3 values through the array             */

/*----------*/
/* COMMANDS */
/*----------*/
programsPath = cd C:\Programs;
home = cd ~;
curdir = pwd;
filelist = ls -la;

/*-----------------------*/
/* FUNCTION DECLARATIONS */
/*-----------------------*/
fn foo() {
	/* returns void */
}

u32 bar(u32 a, u8 b, Object c) {
	/* returns u32 */
}

(u8, u16, u32) returnTuple() {
	return (10, 20, 30);
}

u64 foobar(u32 * ptr, i64 & reference) {
	unsafe {
		*ptr = 10;
	}
	reference = 10; /* Doesn't need reference block. Is mutable by default */
	return reference;
}

/*------------------*/
/* FUNCTION CALLING */
/*------------------*/
foo();
bar(10, 'a', pwd);
println("Test");

/*------------------*/
/* FUNCTION POINTER */
/*------------------*/
fptr1 = bar;                      /* Inferred: u32(u32, u8, Object) */
u64(u32 *, i64 &) fptr2 = foobar; /* Explicit                       */

/*---------------*/
/* IF STATEMENTS */
/*---------------*/
if(v == 10)
	statement1();

if(v == 20) {
	statement1();
	statement2();
}

auto v2 = if(v == 30) 10 else 20; /* Infers datatype u8 */
auto v3 = if(v == 40) 30;         /* Infers two possible datatypes. u8 if v == 30 and () if v != 30. 
                                     This is NOT VALID and an error will be issued */ 

/*-----------------------*/
/* TERNARY IF STATEMENTS */
/*-----------------------*/
/* This is also valid: */
auto v4 = (v2 == 30) ? 1 : 2;

/* And this: */
auto v4 = (v2 == 30) ? {
	/*...*/
	1
} : {
	/*...*/
	2
};

/********************/
/* SWITCH STATEMENT */
/********************/
switch(var) {
	@1: one();
	@2: two();
	@3: 
		three();
		another();

	@4: { /* Curly braces optional */
		four();
		another();
	}
	@5,6,7:
		five();
		six();
		seven();

	@u8: isU8(); /* Is var of type u8 */

	@equalto(): lambdaMatch(); /* Match var's value against equalto() return value */

	@else: /* Default branch */
		none();
	@: /* Also default branch */
		none();
	[bindall]@: /* Get whatever value comes by binding */
		func(bindall);
}

/*-------*/
/* LOOPS */
/*-------*/
for(u16 i = 0; i < 10; i++) {
	/*...*/
}

while(v > 30) {
	v--;
}

/* Curly braces are not mandatory */
while(v > 30)
	v--;

/* And we don't have to fill all statements in the for loop */
for(;;v--);

/* Infinite loop: */
for(;;);
/* Also infinite */
while(1);

/* We may use keywords 'continue' and 'break' */
for(;;) {
	/*...*/
	continue;
}
for(;;) {
	/*...*/
	break;
}

/* We can also use foreach loops */
for(auto v : arr) {
	/* ... */
}

/*---------*/
/* STRUCTS */
/*---------*/
struct Mystruct {
	u8 x;
	u8 y;
};

/* Note: structs are automatically 'typedef'd */

/*---------*/
/* CLASSES */
/*---------*/
class Myclass {
pub:
	Myclass() {
		/* Constructor */
	}

	fn public_function() {

	}

	u8 pubdata;

priv:
	fn private_function() {

	}

	u8 privdata;
};

/* We might also do: */
class Myclass {
	pub Myclass() {
		/* Constructor. Must always be public */
	}

	pub fn public_function() {

	}

	pub u8 pubdata;

	priv fn private_function() {
		/* priv keyword here is optional. Not having priv makes the function 
		   private by default. */
	}

	priv u8 privdata;
};

/*-------*/
/* ENUMS */
/*-------*/
enum Enumlist {
	ENUM1,
	ENUM2,
	ENUM3,
};

enum { /* Anonymous enum */
	ENUM1 = 1, /* Starts at 1 */
	ENUM2,     /* 2           */
	ENUM3 = 5, /* Skips to 5  */
	ENUM4      /* 6           */
};

enum { /* It can be anonymous */
	ENUM1,
	ENUM2,
	ENUM3,
	ENUM4,
	Matchstruct { /* Match this struct */
		u8 x,y,z;
	},
	Tuple(u8, u16, u32) /* Match this tuple */
	(u8, f64) /* Anonymous tuples are allowed */
};

/* We may also do this: */
struct Mystruct {
	u8 x,z,y;
};

enum {
	ENUM1,
	struct Mystruct /* We might want to declare the struct elsewhere */
};

enum {
	ENUM1,
	/* Or perhaps a function which could act as a lambda */
	u8 mylambda() {
		u8 a = 1;
		u8 b = 2;
		a + b
	},
	ENUM2,
};

/*--------------*/
/* DATA CASTING */
/*--------------*/
u8 var = 10;
u16 var2 = (u8)var; /* Simple enough. Just like C/C++/Java/C# */

/*----------*/
/* Examples */
/*----------*/
i32 read_int()
{
	num_str = String(); /* Allocate on heap. Inferred type is * std::String */
	stdin.readline(&num_str);
	num_str.trim().parse<i32>()
}

for(auto file : ls) {
	/* Iterate through every file */
}
}

/*------*/
/* TODO */
/*------*/

/* 1- Review datatypes (generics, ranges, etc.)                               */
/* 2- Add memory specifications (stack, heap, safety, variable binding, etc)  */
/* 3- Pointers (smart pointers only) (DESIGN)                                 */
/* 4- Add scope                                                               */
/* 5- Add function overloading                                                */
/* 6- Add operator overloading                                                */
/* 7- Add imports                                                             */
/* 8- Add error handling                                                      */
/* 9- Add Lambdas                                                             */
/* 10- Add variadics                                                          */
/* 11- Add macros                                                             */
/* 12- Add threads                                                            */
/* 13- Add attributes                                                         */
/* 14- Add test system                                                        */