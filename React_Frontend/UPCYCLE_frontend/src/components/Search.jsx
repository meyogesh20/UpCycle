import React from 'react';
import { useState } from 'react';
import './SearchStyle.css';
import Product from './Product';

const Search = () => {
  const [searchTerm, setSearchTerm] = useState('');
  return (
    <>
      <div className='templateContainer'>
        <div className='searchInput_Container'>
          <input
            id='searchInput'
            type='text'
            placeholder='Search here...'
            onChange={(event) => {
              setSearchTerm(event.target.value);
            }}
          ></input>
        </div>
        <div className='template_Container'>
          {Product.name
            .filter((val) => {
              if (searchTerm == '') {
                return val;
              } else if (
                val.title.toLowerCase().includes(searchTerm.toLowerCase)
              ) {
                return val;
              }
            })
            .map((val) => {
              return <Product />;
            })}
        </div>
      </div>
    </>
  );
};

export default Search;
